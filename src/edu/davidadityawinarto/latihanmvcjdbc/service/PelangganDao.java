/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.davidadityawinarto.latihanmvcjdbc.service;

import edu.davidadityawinarto.latihanmvcjdbc.entity.Pelanggan;
import edu.davidadityawinarto.latihanmvcjdbc.error.PelangganException;
import java.util.List;

/**
 * NIM   : 10118071
 * NAMA  : DAVID ADITYA WINARTO
 * KELAS : IF-2
 */
public interface PelangganDao {
    
    public void insertPelanggan(Pelanggan pelanggan) throws PelangganException;
    
    public void updatePelanggan(Pelanggan pelanggan) throws PelangganException;
    
    public void deletePelanggan(Integer id) throws PelangganException;
    
    public Pelanggan getPelanggan(Integer id) throws PelangganException;
    
    public Pelanggan getPelanggan(String email) throws PelangganException;
    
    public List<Pelanggan> selectAllPelanggan() throws PelangganException;
    
}
