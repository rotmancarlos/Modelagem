package org.example;

import Responsabilidadeunica.Pais;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pais japao = new Pais("JP", "Japão", 211755692, 8515767.049);
        Pais china = new Pais("CN", "China", 45376763, 2780400);
        Pais coreia = new Pais("CRS", "Correia do Sul", 7052983, 406752);
        Pais russia = new Pais("RS", "Rússia", 3469551, 181034);

        japao.adicionarFronteira(china);
        japao.adicionarFronteira(coreia);
        japao.adicionarFronteira(russia);

        System.out.println(japao.isVizinho(china)); // true
        System.out.println(china.isVizinho(russia)); // True
        System.out.println(china.isVizinho(coreia)); // false

        System.out.println(japao.getDensidadePopulacional()); // 24.880962923641297

        List<Pais> vizinhosComuns = china.getVizinhosComuns(russia);
        for (Pais vizinho : vizinhosComuns) {
            System.out.println(vizinho.getNome()); // Russia
        }
    }
}