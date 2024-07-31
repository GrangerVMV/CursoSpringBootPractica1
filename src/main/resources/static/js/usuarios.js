// Call the dataTables jQuery plugin
$(document).ready(function() {
  console.log("Cargando usuario...");
  cargarUsuario();
  console.log("Cargando listado...");
  cargarListadoUsuarios();
  $('#usuarios').DataTable();
});

// Método para cargar un usuario mediante llamada al servidor (copiado de stackoverflow)
async function cargarUsuario(){
    // URL del recurso que queremos obtener
    const url = "usuario/2343";

// Realizamos la solicitud GET usando fetch con async/await
  const request = await fetch(url, {
    method: 'GET', // Especificamos el método GET, aunque es el predeterminado y podría omitirse
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    }
  });

   // Parseamos la respuesta como JSON
  const usuario = await request.json();

   // Mostramos el contenido en la consola
  console.log(usuario);
}

// Método para cargar un listado de usuarios mediante llamada al servidor (copiado de stackoverflow)
async function cargarListadoUsuarios(){
    // URL del recurso que queremos obtener
    const url = "usuarios";

// Realizamos la solicitud GET usando fetch con async/await
  const request = await fetch(url, {
    method: 'GET', // Especificamos el método GET, aunque es el predeterminado y podría omitirse
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    }
  });

   // Parseamos la respuesta como JSON
  const usuarios = await request.json();

   // Mostramos el contenido en la consola
  console.log(usuarios);
}