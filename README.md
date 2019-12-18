# Nómina en JAVA con NetBeans
Proyecto escolar desarrollado en JAVA y NetBeans de impresión de recibos de pagos de una nómina.

## Funcionamiento

* Al iniciar el programa se intenta cargar el archivo "nomina.obj". Si el archvio no existe, se crea uno nuevo.
* La pantalla principal tiene tres menús: Archivo, Registro y Ayuda.
  - Archivo
    - Guardar - Se debe utilizar esta opción para guardar los cambios realizados durante el uso de la aplicación. Si no se usa esta opción los cambios no serán guardados.
    - Salir - Cierra la aplicación sin guardar los cambios.
  - Registro
    - Altas - Permite ingresar un nuevo registro.
    - Bajas - Permite eliminar un archivo existente.
    - Cambios - Permite modificar un archivo existente.
    - Buscar - Busca los registros que coincidan con el criterio de búsqueda especificado (nombre del empleado). Se habilita la opción "Buscar siguiente" en caso de que existan más de un registro que coincida con el valor proporcionado.
    - Mostrar todos - Muestra un listado de todos los registros almacenados.
    - Generar nómina - Muestra un listado de los registros almacenados con el cálculo del sueldo percibido en forma de sencillos recibos de nómina.
  - Ayuda
    - Acerca de - Muestra un cuadro de diálogo con información referente al desarrollo.
