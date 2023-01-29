package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	
	@RequestMapping("/home")
	public String home() {
		
		System.out.println("It is the home page");
		return "home";
	}
	
	
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("box") String box) {
		
		String url="https://www.google.com/search?q=" + box;
		
		RedirectView redirectView = new RedirectView();

		redirectView.setUrl(url);
		
		return redirectView;
	}
}
