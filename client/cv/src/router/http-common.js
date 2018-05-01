import AXIOS from 'axios'

export const axios = AXIOS.create({
  baseURL: getBaseUrl()
})

function getBaseUrl () {
  return 'http://18.188.25.74:8080'
}
