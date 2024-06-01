package br.com.lanchonete.dao;

import br.com.lanchonete.models.Categoria;

import java.util.ArrayList;
import java.util.List;

public class CategoriaDAO {

    private static List<Categoria> categoriaList = new ArrayList<>();

    public static Categoria adicionar(Categoria categoria){
        categoriaList.add(categoria);
        return categoria;
    }

    public static Categoria atualizar(Categoria categoria){
        categoriaList.add(categoria);
        return categoria;
    }

    public static List<Categoria> buscarTodos(){
        return categoriaList;
    }

    public static Categoria buscarNome(String nomeCategoria){
        for(Categoria item : categoriaList){
            if (item.getNomeCategoria().equalsIgnoreCase(nomeCategoria) ){
                return item;
            }
        }
        Categoria c = new Categoria();
        return c;
    }

    public static Categoria remover(Categoria categoria){
        categoriaList.remove(categoria);
        return categoria;
    }
}
