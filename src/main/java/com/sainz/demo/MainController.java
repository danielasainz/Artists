package com.sainz.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/*
1. Navbar with the following links:

        - Add an artiste

        - Add a song

        - Artistes - this option will show all artistes

        - Songs - this option will show all songs

        Make sure the navigation bar displays the link that the user has currently selected.

        2. A full page background - that tells what your page is about with title text and a sub-heading, both centered.


        You should be able to add artistes:

           - Full Name

           - Stage Name (aka)

           - Image (add a default image if no image exists)  - this should be a rounded image. Make it a circle!

        Add a minimum of 3.


        You should be able to add songs:

        - Title

        - Year Released

        - Lead artiste (only one person)
*/

@Controller

public class MainController {

@RequestMapping("/")
    public String showIndex(Model model){
        model.addAttribute("menuoption", "home");
    return "index";
}
@RequestMapping("/addArtist")
    public String addArtist(Model model) {
    model.addAttribute("menuoption", "addartist");
    return "addArtist";
}
@RequestMapping("/addSong")
    public String addSong(Model model){
    model.addAttribute("menuoption","addsong");
    return "addSong";
}
@RequestMapping("/showSong")
    public String showSong(Model model) {
    model.addAttribute("menuoption","showsong");
    return "showSong";
}
@RequestMapping("/showArtist")
    public String showArtist(Model model) {
    model.addAttribute("menuoption","showartist");
    return "showArtist";
}

}


