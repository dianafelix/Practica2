package com.test.clase.demo.controller;
import com.test.clase.demo.model.CurriculumVitae;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cv")

public class CVController {

    @GetMapping (value = "/datos")
    public String obtenerDatos(Model model){
        CurriculumVitae vitae = new CurriculumVitae();
        vitae.setNombre("Diana Felix");
        vitae.setDirecc("Calle Monreal Av. Ferrol #2998");
        vitae.setCorreo("felix.diana@uabc.edu.mx");
        vitae.setTel("686-235-9238");
        vitae.setPerfil("Estudiante con una formación sólida para analizar," +
                " diseñar, desarrollar, administrar y evaluar productos de software; " +
                "así como administrar " +
                "áreas de tecnología de la información");
        vitae.setEstudioss("Universidad Autonoma de Baja California");
        vitae.setCarrera("Licenciado en Sistemas Computacionales");
        vitae.setFoto("Diana.jpg");
        vitae.setInfo("Actualmente estoy en el área de informática ayudando con el mantenimiento de base de datos en DBeaver");

        model.addAttribute("cv", vitae);
    return "cv";

    }

}
