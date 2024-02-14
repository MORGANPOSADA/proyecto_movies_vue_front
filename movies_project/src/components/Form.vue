<template>
  <b-form v-if="show" @submit="addNewBook">
    <b-form-group label="Titulo de la obra">
      <b-form-input v-model="name"></b-form-input>
    </b-form-group>
    <b-form-group label="Autor">
      <b-form-input v-model="author"></b-form-input>
    </b-form-group>
    <b-form-group label="Año de publicación">
      <b-form-input v-model="publicationYear"></b-form-input>
    </b-form-group>
    <b-form-group label="Género">
      <b-form-select v-model="selectedGenre">
        <option v-for="genre in genres" :key="genre.id" :value="genre.id">
          {{ genre.description }}
        </option>
      </b-form-select>
    </b-form-group>
    <b-button type="submit" class="mt-3" variant="primary"
      >Registrar nuevo libro</b-button
    >
    <div v-if="loading" class="loader">Cargando...</div>
  </b-form>
</template>

<script>
export default {
  data() {
    return {
      form: {
        email: "",
        name: "",
        food: null,
        checked: [],
      },
      foods: [
        { text: "Select One", value: null },
        "Carrots",
        "Beans",
        "Tomatoes",
        "Corn",
      ],
      show: true,
    };
  },
  methods: {
    onSubmit(event) {
      event.preventDefault();
      alert(JSON.stringify(this.form));
    },
    onReset(event) {
      event.preventDefault();
      // Reset our form values
      this.form.email = "";
      this.form.name = "";
      this.form.food = null;
      this.form.checked = [];
      // Trick to reset/clear native browser form validation state
      this.show = false;
      this.$nextTick(() => {
        this.show = true;
      });
    },
  },
};
</script>