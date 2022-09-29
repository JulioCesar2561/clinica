package br.com.clinica.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "clinica")
public class PessoaController {

    @RequestMapping(value = "/status", method = RequestMethod.GET)
    public String status(){

        return "<!DOCTYPE html>\n" +
                "<html lang=\"pt-br\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>Status Servidor \uD83D\uDE1C</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "        <header>\n" +
                "            <h1>Ligadão</h1>\n" +
                "        </header>\n" +
                "        <main>\n" +
                "            <section class=\"Introdução\">\n" +
                "                <p>Programa embarco java, spring initializr, maven, H2 Banco de Dados </p>\n" +
                "            </section>\n" +
                "        </main>\n" +
                "        <footer>\n" +
                "            <p>\n" +
                "                <a href=\"http://localhost:8080/pessoa/consultar\">Indisponivel</a>\n" +
                "            </p>\n" +
                "        </footer>\n" +
                "</body>\n" +
                "</html>   ";
    }

}
