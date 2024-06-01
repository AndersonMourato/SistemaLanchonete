package br.com.lanchonete.services;

import br.com.lanchonete.dao.CategoriaDAO;
import br.com.lanchonete.models.Categoria;

import java.util.List;
import java.util.Scanner;

public class CategoriaService {

    public void adicionar(){
        Scanner sc = new Scanner(System.in);

        System.out.println("############## ADICIONAR NOVA CATEGORIA ##############");
        System.out.print("NOME: ");
        Categoria c = new Categoria( sc.nextLine() );

        CategoriaDAO.adicionar(c);
    }

    public void atualizar(){
        Scanner sc = new Scanner(System.in);
        List<Categoria> lista = CategoriaDAO.buscarTodos();

        System.out.println("############## ALTERAR CATEGORIA ##############");
        System.out.println("Digite o nome da categoria para alterar.");
        String nome = sc.nextLine();

        for (int i=0; i < lista.size(); i++){
            if (lista.get(i).getNomeCategoria().equalsIgnoreCase(nome)){
                System.out.println("Digite o nome ATUALIZADO");
                lista.get(i).setNomeCategoria(sc.nextLine());
                break;
            }
        }
    }


}
