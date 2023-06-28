
package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Fabricante;
import tienda.entidades.Producto;
import tienda.servicios.fabricanteServicio;
import tienda.servicios.productoServicio;

public final class fabricanteDAO extends DAO {
    
   private fabricanteServicio fabricanteServicio;

    public fabricanteDAO() {
        this.fabricanteServicio = fabricanteServicio;
    }
    
    public void insertarFabricante(Fabricante fabricante) throws Exception {
        try {
            if (fabricante == null) {
                throw new Exception("Debe indicar un producto");
            }
            String sql = "INSERT INTO fabricante (codigo, nombre) "
                    + "VALUES ( '" + fabricante.getCodigo() + "' , '" + fabricante.getNombre() + " );";

            System.out.println(sql);
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
    
}
