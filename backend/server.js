const express = require('express');

const app = express();

app.get('/api/services/AnimeService', (req, res) => {
  res.json({
    status: 'success',
    message: 'AnimeService is working!',
  });
});

app.listen(8080, () => {
  console.log('Servidor backend rodando na porta 8080');
});