package jp.genuine.training.carmanager.web.car.summary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.bind.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;

import jp.genuine.training.carmanager.model.car.summary.CarSummaryList;
import jp.genuine.training.carmanager.model.user.LoginUser;
import jp.genuine.training.carmanager.service.carsummarylist.CarSummaryListService;

@Controller
@RequestMapping("/car/summary")
public class CarSummaryListController {

	@Autowired
	private CarSummaryListService carSummaryListService;

	@RequestMapping(value="",method=RequestMethod.GET)
	public String list(
			@AuthenticationPrincipal LoginUser loginUser,
			Model model,
			WebRequest request)
	{

		CarSummaryList carSummaryList = carSummaryListService.listOf(loginUser);

		model.addAttribute("carSummaryList",carSummaryList);

		return "/car/summary/list";
	}

}
