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
public class EditController {
    ViewInputBarang viewIB;
    ModelBarang modelB;
    String id;

    public EditController(ViewInputBarang vib, ModelBarang mb, String id) {
        this.viewIB = vib;
        this.modelB = mb;
        this.id = id;
        
        String detailBarang[]=mb.detailBarang(id);                                
            vib.tfnama.setText(detailBarang[1]);
            vib.tfmassa.setText(detailBarang[2]);
            vib.tfharga.setText(detailBarang[3]);
        vib.btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {                               
                mb.updateData(id,vib.getTfnama(),vib.getTfmassa(),vib.getTfharga());   
                ViewLihatBarang vlb=new ViewLihatBarang();
                vib.setVisible(false);
                LihatBarangController Start=new LihatBarangController(vlb, mb);
            }
        });
    }
    
    
}
