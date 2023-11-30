package br.com.alura.mvc.mudi.controller;

import br.com.alura.mvc.mudi.model.Pedido;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(Model model){
        Pedido pedido = new Pedido();
        pedido.setNomeProduto("PlaySatation 5");
        pedido.setUrlImagem("https://m.media-amazon.com/images/I/51+qnZm7V7L._AC_SL1000_.jpg");
        pedido.setUrlProduto("https://www.amazon.com.br/PlayStation-CFI-1214A01X-Console-5/dp/B0BNSR3MW9/ref=sr_1_1?crid=AEZA1EJAFBMK&keywords=playstation%2B5&qid=1701305464&sprefix=play%2Caps%2C886&sr=8-1&ufe=app_do%3Aamzn1.fos.25548f35-0de7-44b3-b28e-0f56f3f96147&th=1");
        pedido.setDescricao("O melhor console da atualidade !");

        List<Pedido> pedidos = Arrays.asList(pedido);
        model.addAttribute("pedidos", pedidos);

        return "home";
    }
}
