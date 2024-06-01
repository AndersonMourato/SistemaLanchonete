package br.com.lanchonete;

import br.com.lanchonete.dao.CategoriaDAO;
import br.com.lanchonete.models.Categoria;

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

        CategoriaDAO.remover(c1);

        //System.out.println("ITEM LOCALIZADO: " + encontrado.getNomeCategoria());


        List<Categoria> lista = CategoriaDAO.buscarTodos();
        for (Categoria item : lista){
            System.out.println("NOME: " + item.getNomeCategoria());
        }


    }
}
