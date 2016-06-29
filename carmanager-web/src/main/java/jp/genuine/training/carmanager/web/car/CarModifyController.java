package jp.genuine.training.carmanager.web.car;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.bind.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import jp.genuine.training.carmanager.model.car.CarId;
import jp.genuine.training.carmanager.model.car.CarRegister;
import jp.genuine.training.carmanager.model.car.GasolineType;
import jp.genuine.training.carmanager.model.user.LoginUser;
import jp.genuine.training.carmanager.service.car.CarModifyService;

@Controller
@SessionAttributes("car")
@RequestMapping("/car/modify")
public class CarModifyController {

	@Autowired
	private CarModifyService carModifyService;

	@RequestMapping(value="/{carId:\\d+}",method=RequestMethod.GET)
	public String detail(
			@AuthenticationPrincipal LoginUser loginUser,
			@PathVariable("carId") Integer carId,
			Model model,
			HttpServletRequest request)
	{
		CarId carid = new CarId(carId);
		CarRegister resultCar = carModifyService.findByDetail(carid);

		model.addAttribute("car",resultCar);

		List<GasolineType> gasolineType = carModifyService.type();

		model.addAttribute("gasolineType", gasolineType);

		return "/car/modify/form";
	}

	@RequestMapping(value="",method=RequestMethod.POST)
	public String execute(
			@Valid @ModelAttribute("car") CarRegister carRegister,
			BindingResult bindingResult,
			@AuthenticationPrincipal LoginUser loginUser,
			Model model,
			HttpServletRequest request)
	{
		model.addAttribute("carRegister",carRegister);
		if(bindingResult.hasErrors())
			return "car/modify/form";

		carModifyService.modify(carRegister,loginUser.getUser());

		return "/car/modify/completed";
	}

}
