/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.davidadityawinarto.latihanmvcjdbc.event;

import edu.davidadityawinarto.latihanmvcjdbc.entity.Pelanggan;
import edu.davidadityawinarto.latihanmvcjdbc.model.PelangganModel;

/**
 * NIM   : 10118071
 * NAMA  : DAVID ADITYA WINARTO
 * KELAS : IF-2
 */
public interface PelangganListener {
    
    public void onChange(PelangganModel model);
    
    public void onInsert(Pelanggan pelanggan);
    
    public void onUpdate(Pelanggan pelanggan);

    public void onDelete();
}
