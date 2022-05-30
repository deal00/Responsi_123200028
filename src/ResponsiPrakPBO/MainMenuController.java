/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ResponsiPrakPBO;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ASUS
 */
public class MainMenuController {
    ViewMainMenu ViewMM;

    public MainMenuController(ViewMainMenu vmm) {
        this.ViewMM = vmm;
        
        ViewMM.btnTambah.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {                               
                ModelBarang modelbarang = new ModelBarang();
                ViewInputBarang inputbarang= new ViewInputBarang();
                ViewMM.setVisible(false);
                InputBarangController inputbarangController=new InputBarangController(inputbarang,modelbarang);
            }
        });
        
        ViewMM.btnLihat.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) { 
                ViewLihatBarang lihatbarang= new ViewLihatBarang();
                ModelBarang modelbarang = new ModelBarang();
                ViewMM.setVisible(false);
                LihatBarangController lihatbarangController =new LihatBarangController(lihatbarang,modelbarang);
            }
        });
    }
}
