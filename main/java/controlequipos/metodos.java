/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlequipos;

/**
 *
 * @author uwual
 */
public class metodos {
    
    private static String FechaIngreso=null, 
                          Distrito=null, 
                          TipoMarca=null, 
                          CodigoInventario=null,
                          NombreQuienIngresa=null,
                          NombreDelQueRecibe=null,
                          FechaSalida=null,
                          QuienEntrega=null,
                          TipodeServicio=null;

    public static String getFechaIngreso() {
        return FechaIngreso;
    }

    public static void setFechaIngreso(String aFechaIngreso) {
        FechaIngreso = aFechaIngreso;
    }

    public static String getDistrito() {
        return Distrito;
    }

    public static void setDistrito(String aDistrito) {
        Distrito = aDistrito;
    }

    public static String getTipoMarca() {
        return TipoMarca;
    }

    public static void setTipoMarca(String aTipoMarca) {
        TipoMarca = aTipoMarca;
    }

    public static String getCodigoInventario() {
        return CodigoInventario;
    }

    public static void setCodigoInventario(String aCodigoInventario) {
        CodigoInventario = aCodigoInventario;
    }

    public static String getNombreQuienIngresa() {
        return NombreQuienIngresa;
    }

    public static void setNombreQuienIngresa(String aNombreQuienIngresa) {
        NombreQuienIngresa = aNombreQuienIngresa;
    }

    public static String getNombreDelQueRecibe() {
        return NombreDelQueRecibe;
    }

    public static void setNombreDelQueRecibe(String aNombreDelQueRecibe) {
        NombreDelQueRecibe = aNombreDelQueRecibe;
    }

    public static String getFechaSalida() {
        return FechaSalida;
    }

    public static void setFechaSalida(String aFechaSalida) {
        FechaSalida = aFechaSalida;
    }

    public static String getQuienEntrega() {
        return QuienEntrega;
    }

    public static void setQuienEntrega(String aQuienEntrega) {
        QuienEntrega = aQuienEntrega;
    }

    public static String getTipodeServicio() {
        return TipodeServicio;
    }

    public static void setTipodeServicio(String aTipodeServicio) {
        TipodeServicio = aTipodeServicio;
    }
}
