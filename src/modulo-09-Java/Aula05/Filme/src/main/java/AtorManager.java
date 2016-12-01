/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.com.cwi.crescer.filme.Dao.entity.Ator;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Jonathan-David
 */
@ManagedBean
@ViewScoped
public class AtorManager {
    
    private Ator ator = new Ator();
    
    public AtorManager() {
    }

    public Ator getAtor() {
        return ator;
    }

    public void setAtor(Ator ator) {
        this.ator = ator;
    }
}
