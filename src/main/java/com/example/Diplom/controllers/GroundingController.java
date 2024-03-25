package com.example.Diplom.controllers;



import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.Diplom.models.Grounding;
import com.example.Diplom.servis.GroundingServis;

@Controller
@AllArgsConstructor
public class GroundingController extends Exception{
    public final GroundingServis groundingServis;

    @GetMapping("/groundings")
    public String getGroundings(Model model) {
        model.addAttribute("groundings", groundingServis.getGroundings());
        return "groundings";
    }



    @PostMapping("/groundings")
    public String addGroundings(Grounding grounding, Model model) {
        groundingServis.calculationСlimaticRegion1(grounding);
        groundingServis.calculationTotalElectricalResistanceGround(grounding);
        groundingServis.calculationResistanceSingleVerticalGrounding(grounding);
        groundingServis.calculationResistanceTotalVerticalGrounding(grounding);
        groundingServis.calculationResistanceHorizontalGrounding(grounding);
        groundingServis.calculationTotalResistanceHorizontalGrounding(grounding);
        groundingServis.calculationtotalResistanceGrounding(grounding);


        groundingServis.addGrounding(grounding);
        model.addAttribute("groundings", groundingServis.getGroundings());
        return "groundings";
    }


}
