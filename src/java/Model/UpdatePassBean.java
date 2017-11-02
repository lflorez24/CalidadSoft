/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author User
 */
@ManagedBean(name = "up")
@SessionScoped
public class UpdatePassBean {

    private String oldP;
    private String newP;
    private String vNewP;

    public void setOldP(String oldP) {
        this.oldP = oldP;
    }

    public void setNewP(String newP) {
        this.newP = newP;
    }

    public void setVNewP(String vNewP) {
        this.vNewP = vNewP;
    }

    public String getOldP() {
        return oldP;
    }

    public String getNewP() {
        return newP;
    }

    public String getVNewP() {
        return vNewP;
    }

    public boolean updatePass() {
        FacesContext instance = FacesContext.getCurrentInstance();
        String e = (String) instance.getAttributes().get("User");
        String s = "UPDATE USER SET pass='" + newP + "' WHERE EMAIL=" + e + ";";
        return true;
    }

}
