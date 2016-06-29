package jp.genuine.training.carmanager.web.car.oiling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;

import jp.genuine.training.carmanager.model.oiling.Oiling;
import jp.genuine.training.carmanager.model.oiling.OilingId;
import jp.genuine.training.carmanager.service.oiling.OilingService;

@Controller
@RequestMapping("/oiling")
public class OilingController {

	@Autowired
	private OilingService oilingService;

	@RequestMapping(value="/detail/{oilingId:\\d+}", method=RequestMethod.GET)
	public String detail(
			@PathVariable("oilingId") Integer oilingId,
			Model model,
			WebRequest request)
	{
		OilingId oilingid = new OilingId(oilingId);
		Oiling resultOiling = oilingService.findByOiling(oilingid);

		model.addAttribute("oiling", resultOiling);

		return "/oiling/detail";
	}

}
