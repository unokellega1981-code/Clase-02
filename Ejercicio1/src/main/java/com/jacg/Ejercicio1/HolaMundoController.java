package com.jacg.Ejercicio1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController {

    @GetMapping("/hola")
    public String holaMundo() {
        return "Hola mundo";
    }

    @GetMapping("/hola/{name}")
    public String holaNombre(@PathVariable String name) {
        return "Hola " + name;
    }

    @GetMapping("/Cuadrado/{number}")
    public String mumumu(@PathVariable int number) {
        return "El cuadrado de ese número es " + (int) Math.pow(number, 2);
    }
}
