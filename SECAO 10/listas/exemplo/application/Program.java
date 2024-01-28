package application;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args){

        List<String> list = new ArrayList<>();

//        adicionando elementos à lista
        list.add("maria");
        list.add("alex");
        list.add("bob");
        list.add("anna");

//        adicionar um elemento na posicao 2 -> no lugar do bob
        list.add(2, "marco");

//        tamanho da lista
        System.out.println(list.size());

//        tirar alguem da lista
//              bucando por nome
                list.remove("anna");

//              buscando por ligar da lista
                list.remove(1);

//              remover da lista por predicado, no caso a inicial do nome
//              o que esta dentro das condicoes e a lambda, ou seja retorna verdadeiro ou falso
                list.removeif(x -> x.charAt(0) == "m")
//              =+=

//      encontrar uma posicao na lista
        System.out.println("index of bob" + list.indexOf("bob"));
//      se procurar alguem que nao existe na lista
        System.out.println("index of marco" + list.indexOf("marco"));
//      o retorno vai seer -1, pois nao encontrou o elemento

//      AKA =+=
//      fazer o oposto, tirar todo mundo da lista e deixar apenas quem tem a letra M como inicial
//      criar uma nova lista, assim salvar os nomes nela
        List <String> result = list.stream().filter(x -> x.charAt(0) == "a").collect(Collectors.toList());

//      encontrar um elemento da lista que atenda a um certo predicado
        String name = list.stream.filter(x -> x.charAt(0) == "a").findFirst().orElse(null);
//        se nao encontrar presente na lista, ele ira retornar null


//        imprimir a lista -> list
        for(String x : list){
            System.out.println(x);
        }

//        imprimir a lista -> resolt
        for(String x : result){
            System.out.println(x);
        }
    }
}
