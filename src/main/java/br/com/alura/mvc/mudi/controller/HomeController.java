package br.com.alura.mvc.mudi.controller;

import br.com.alura.mvc.mudi.model.Pedido;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(Model model){
        Pedido pedido = new Pedido();
        pedido.setNomeProduto("Echo Dot");
        pedido.setUrlPedido("https://www.amazon.com.br/gp/product/B07PDHSJ1H?ref_=gw_ATF_echodot3a&pf_rd_r=JCKHXZVACNAC7CK7ZE7N&pf_rd_p=2c16e2a6-0c3e-418f-8f15-af4c1ba99640&pd_rd_r=ab796621-414c-4a88-a4f6-8ade47cc75cb&pd_rd_w=vVfah&pd_rd_wg=gG6na");
        pedido.setDescricao("Descricao qualquer");
        pedido.setUrlImagem("https://images-na.ssl-images-amazon.com/images/I/714Rq4k05UL._AC_UL160_SR160,160_.jpg");
        pedido.setDataDaEntrega(LocalDate.now());
        pedido.setValorNegociado(BigDecimal.valueOf(100));

        List<Pedido> pedidos = Arrays.asList(pedido);
        model.addAttribute("pedidos", pedidos);

        return "home";
    }
}
