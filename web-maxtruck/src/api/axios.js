import axios from "axios";

export const api = axios.create({
  baseURL: 'http://localhost:8080', // URL base da API
});

export const createUser = (userData) => {
  return api.post('/user/', userData); 
};

export const loginUser = (loginData) => {
  return api.post('/user/auth', loginData); 
};

export const getBridges = async () => {
  const response = await api.get('/bridges');
  return response.data;
};

export const getUserProfile = async (userId) => {
  const response = await api.get(`/user/${userId}`); 
  return response.data;
};








