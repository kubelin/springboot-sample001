package com.swa.jspsample.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.samsung.swa.extention.common.TestCommon;

@Controller
public class HomeController {


    @GetMapping({"/", "/home"})
    public String home() {
      System.out.println("home ");
      TestCommon testCommon = new TestCommon();
      String name = testCommon.getName("temp");
      System.out.println(name);

        return "home";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/hello")
    public String hello(Model model, @RequestParam String name) {
        model.addAttribute("name", name);
        return "hello";
    }

    @GetMapping("/books")
    public String addBook(Model model, @RequestParam(required = false) String name) {
      //        if (name != null) {
      //          books.add(new Book(name));
      //        }
      //        model.addAttribute("books", books);

        return "books";
    }
}
