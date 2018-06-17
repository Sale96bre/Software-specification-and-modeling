/***********************************************************************
 * Module:  Komponenta.java
 * Author:  ra35-2015
 * Purpose: Defines the Class Komponenta
 ***********************************************************************/

package etapa1.model;

import java.io.Serializable;
import java.util.*;

import etapa1.model.events.EventEditImeProjekat;
import etapa2.model.events.EventEditImeStranica;

/** @pdOid 67419875-2963-4b9e-9182-57a47b4eb40e */
public abstract class Komponenta extends Observable implements Serializable{
   /** @pdOid 70cf7290-7cad-4dc4-ac77-37ba23efa527 */
   protected String naziv;
   
   /** @pdOid de1ec76c-23cb-459e-93bc-1a2d8566018d */
   public void promenaImena(String noviNaziv) {
      // TODO: implement
	   
   }
   
   /** @param komponenta
    * @pdOid 2e1cfd06-9a13-40a3-a41e-1b24148ffe1f */
   public void addKomponentu(Komponenta komponenta) {
      // TODO: implement
   }
   
   /** @param komponenta
    * @pdOid acf57fce-445a-44e2-bef3-3fab8d90c010 */
   public void removeKomponenta(Komponenta komponenta) {
      // TODO: implement
   }

public String getNaziv() {
	return naziv;
}

public void setNaziv(String naziv) {
	this.naziv = naziv;
}

}