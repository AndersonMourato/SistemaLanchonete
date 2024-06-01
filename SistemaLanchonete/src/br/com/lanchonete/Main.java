package br.com.lanchonete;

import br.com.lanchonete.dao.CategoriaDAO;
import br.com.lanchonete.models.Categoria;
import br.com.lanchonete.services.CategoriaService;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Categoria c1 = new Categoria("Bebida");
        Categoria c2 = new Categoria("Alimento");
        Categoria c3 = new Categoria("Adicional");
        Categoria c4 = new Categoria("Ingrediente");

        CategoriaDAO.adicionar(c1);
        CategoriaDAO.adicionar(c2);
        CategoriaDAO.adicionar(c3);
        CategoriaDAO.adicionar(c4);


        List<Categoria> lista = CategoriaDAO.buscarTodos();
        for (Categoria item : lista) {
            System.out.println("NOME: " + item.getNomeCategoria());
        }

        System.out.println("\n--------------------------------------------------------------");

        new CategoriaService().adicionar();
        new CategoriaService().adicionar();


        for (Categoria item : lista) {
            System.out.println("NOME: " + item.getNomeCategoria());
        }

        new CategoriaService().atualizar();

        System.out.println("\n--------------------------------------------------------------");

        for (Categoria item : lista){
            System.out.println("NOME: " + item.getNomeCategoria());
        }

    }
}
