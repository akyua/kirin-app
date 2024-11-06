import axios from 'axios';

axios.defaults.baseURL = 'http://localhost:8080';

export const login = async (formData) => {
    try {
      const response = await axios.post('/auth/login', formData);
      return response.data; 
    } catch (error) {
      throw error; 
    }
};
  
export const register = async (formData) => {
    try {
      const response = await axios.post('/auth/register', formData);
      return response.data; 
    } catch (error) {
      throw error;
    }
};