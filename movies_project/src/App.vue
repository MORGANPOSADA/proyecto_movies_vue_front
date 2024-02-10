<template>
  <div>
    <b-navbar type="dark" variant="dark">
      <b-navbar-brand class="mx-auto">
        <h1 class="mb-0">Películas</h1>
      </b-navbar-brand>
    </b-navbar>

    <div>
      <b-container class="bv-example-row">
        <b-row align-h="end">
          <b-col sm="2">
          <b-button v-b-modal.modal-1 variant="success">
            <b-icon-plus></b-icon-plus></b-button>
          </b-col>
          
          <b-modal id="modal-1" title="Añadir nueva película">
            <!-- AQUI VA EL CONTENIDO DE MI MODAL -->
          </b-modal>
        </b-row>

        <b-row>
        </b-row>
      </b-container>
    </div>
  </div>
</template>


