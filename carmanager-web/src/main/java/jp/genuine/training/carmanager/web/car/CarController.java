package jp.genuine.training.carmanager.web.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;

import jp.genuine.training.carmanager.model.car.Car;
import jp.genuine.training.carmanager.model.car.CarId;
import jp.genuine.training.carmanager.service.car.CarService;

@Controller
@RequestMapping("/car")
public class CarController {

	@Autowired
	private CarService carService;

	@RequestMapping(value="/detail/{carId}",method=RequestMethod.GET)
	public String detail(
			@PathVariable("carId") Integer carId,
			Model model,
			WebRequest request)
	{
		CarId carid = new CarId(carId);
		Car resultCar = carService.findBy(carid);

		model.addAttribute("car",resultCar);

		return "/car/detail";
	}

}
