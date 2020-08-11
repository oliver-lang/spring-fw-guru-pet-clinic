package springfwgurupetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import springfwgurupetclinic.services.OwnerService;


@RequestMapping("/owners")
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        System.out.println("OwnersController.OwnersController");
        this.ownerService = ownerService;
    }

    @RequestMapping({"", "/index", "/index.html"})
    public String listOwners(Model model) {
        System.out.println("OwnersController.listOwners");
        model.addAttribute("owners", ownerService.findAll());
        System.out.println(ownerService.findAll());
        return "owners/index";
    }
}
