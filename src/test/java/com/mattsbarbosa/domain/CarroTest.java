package com.mattsbarbosa.domain;

import com.mattsbarbosa.dao.*;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class CarroTest {

    private ICarroDAO carroDAO;
    private IMarcaDAO marcaDAO;
    private IAcessorioDAO acessorioDAO;

    public CarroTest() {
        carroDAO = new CarroDAO();
        marcaDAO = new MarcaDAO();
        acessorioDAO = new AcessorioDAO();
    }

    @Test
    public void Cadastrar() {
        Carro carro = new Carro();
        carro.setModelo("Etios 1.8");
        carro.setPreco(80.000);

        Marca marca = new Marca();
        marca.setNome("TOYOTA");
        marca.add(carro);

        Acessorio acessorio = new Acessorio();
        acessorio.setNome("Airbag");
        acessorio.setPreco(800d);
        acessorio.add(carro);

        carro.add(acessorio);
        carro.setMarca(marca);

        marcaDAO.cadastrar(marca);
        Carro carroDB = carroDAO.cadastrar(carro);
        assertNotNull(carroDB);
    }
}