package com.API.Albuns.Controller;

import com.API.Albuns.Model.Album;
import com.API.Albuns.Model.Lista;
import com.API.Albuns.Repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class AlbumController {
    
    //Notação para buscar as dependências do Repository
    @Autowired
    private AlbumRepository er;

    //Redireciona a requisição HTTP para esse método
    @RequestMapping("/cadastrarAlbum") 
    public String formAlbum() {
        return "formAlbum";//Retorna o caminho do template HTML a ser exibido
    }

    @PostMapping("/cadastrarAlbum")
    public String formAlbum(@Valid Album album, BindingResult result, RedirectAttributes attributes) {
        if (result.hasErrors()) {
            attributes.addFlashAttribute(
                    "mensagem", "Verifique os campos!");
            return "redirect:/cadastrarAlbum";
        }
        er.save(album);
        return "redirect:/albuns";
    }

    @RequestMapping("/albuns")
    public ModelAndView listaEventos() {
        ModelAndView mv = new ModelAndView("index");
        Iterable<Album> eventos = er.findAll();
        mv.addObject("albuns", eventos);

        return mv;
    }

    @RequestMapping("/{idAlbum}")
    public ModelAndView detalhesEvento(@PathVariable("idAlbum") long idAlbum) {
        Album ev = er.findByIdAlbum(idAlbum);
        ModelAndView mv = new ModelAndView("detalhesAlbum");
        mv.addObject("album", ev);
        return mv;
    }
}
