import Vue from 'vue'
import Resource from 'vue-resource'

Vue.use(Resource)

export default {

  setLanguage (state, language) {
    state.language = language
  }
}
