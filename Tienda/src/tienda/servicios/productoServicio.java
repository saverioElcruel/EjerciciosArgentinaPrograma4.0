package tienda.servicios;

import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Fabricante;
import tienda.entidades.Producto;
import tienda.persistencia.productoDAO;

/*
CRUD (create, read, update y delete)
crear (o insertar), consultar, actualizar y borrar
*/

public class productoServicio {
    
     private productoDAO dao;

    public productoServicio() {
        this.dao = new productoDAO();
    }
    
    public void insertarProducto(String nombre, double precio, int codigoFabricante) throws Exception {
        try {
            //Validamos
           
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar nombre del producto");
            }
             if (precio == 0) {
                throw new Exception("Debe indicar un precio razonable");
            }
             if (codigoFabricante == 0 ) {
                throw new Exception("Debe indicar el código del fabricante");
            }
            //Creamos el producto
            Producto producto = new Producto();
            producto.setNombre(nombre);
            producto.setPrecio(precio);
            producto.setCodigoFabricante(codigoFabricante);
            dao.insertarProducto(producto);
        } catch (Exception e) {
            throw e;
        }
    }
        
        public void modificarProductoPrecio(int codigo, double nuevoPrecio) throws Exception {
        try {
            //Validamos
            if (codigo == 0) {
                throw new Exception("Debe indicar el nombre del producto");
            }
            if (nuevoPrecio == 0) {
                throw new Exception("Debe indicar el precio");
            }
            //Buscamos
            Producto producto = buscarProductoPorCodigo(codigo);
            //Modificamos
            producto.setPrecio(nuevoPrecio);
            dao.modificarProductoPrecio(producto);
        } catch (Exception e) {
            throw e;
        }
        }
        
        public Producto buscarProductoPorCodigo(int codigo) throws Exception {
        try {
            //Validamos
            if (codigo == 0) {
                throw new Exception("Debe indicar el código del producto");
            }
            Producto producto = dao.buscarProductoPorCodigo(codigo);
            return producto;
        } catch (Exception e) {
            throw e;
        }
    }
        // Llama a productosDAO para que liste el nombre de todos los productos que hay en la tabla producto
        public ArrayList<String> listarProductosPorNombre() throws Exception {
        try {
            ArrayList<String> productosNombre = dao.listarProductosPorNombre();
            return productosNombre;
        } catch (Exception e) {
            throw e;
        }
    }
        // Llama a productosDAO para que liste los nombres y los precios de todos los productos de la tabla producto.
        public Collection<Producto> listarProductosPorNombreYprecio() throws Exception {
        try {
            Collection<Producto> productosNombreyPrecio = dao.listarProductosPorNombreYprecio();
            return productosNombreyPrecio;
        } catch (Exception e) {
            throw e;
        }
        }
        // pide a productosDao las ofertas
        public Collection<Producto> productosOfertas()throws Exception{
        try{
            Collection<Producto> productosOferta = dao.productosOferta();
            return productosOferta;
        }catch(Exception e){
            throw e;
        }
    }
        
        // pide a productosDAO todos los portátiles
        
        public Collection<Producto> productosPortatiles()throws Exception{
        try{
            Collection<Producto> productosPortatiles = dao.productosPortatiles();
            return productosPortatiles;
        }catch(Exception e){
            throw e;
        }
    }
        // pide a productosDAO el más barato
        public Collection<Producto> productoMasBarato()throws Exception{
            try{
                Collection<Producto> productoMasBarato = dao.productoMasBarato();
                return productoMasBarato;
            }catch(Exception e){
                throw e;
            }
        }
    }

    
    
    

