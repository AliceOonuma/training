package jp.genuine.training.carmanager.web.car;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.bind.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import jp.genuine.training.carmanager.model.car.CarRegister;
import jp.genuine.training.carmanager.model.car.CarRegisterFactory;
import jp.genuine.training.carmanager.model.user.LoginUser;
import jp.genuine.training.carmanager.service.car.CarRegisterService;

@Controller
@SessionAttributes("carRegister")
@RequestMapping("/car/register")
public class CarRegisterController {

	@Autowired
	private CarRegisterFactory carRegisterFactory;

	@Autowired
	private CarRegisterService carRegisterService;

	@RequestMapping(value="",method=RequestMethod.GET)
	public String form(
			@AuthenticationPrincipal LoginUser loginUser,
			Model model,
			HttpServletRequest request
			)
	{
		CarRegister carRegister = carRegisterFactory.create();
		model.addAttribute("carRegister",carRegister);

		return "/car/register/form";
	}

	@RequestMapping(value="", method=RequestMethod.POST)
	public String execute(
			@Valid @ModelAttribute("carRegister") CarRegister carRegister,
			BindingResult bindingResult,
			@AuthenticationPrincipal LoginUser loginUser,
			Model model,
			HttpServletRequest request
			)
	{
		model.addAttribute("carRegister",carRegister);
		if(bindingResult.hasErrors())
			return "car/register/form";

		carRegisterService.register(carRegister,loginUser.getUser());

		return "car/register/completed";
	}

}
