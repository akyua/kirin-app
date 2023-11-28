import axios from 'axios';

export default class AnimeService {
  constructor() {
    this.axios = axios.create();
  }

  getAnime(animeId) {
    const url = `https://api.jikan.moe/v4/anime/${animeId}`;
    return this.axios.get(url);
  }

  searchAnime(animeTitle) {
    const url = `https://api.jikan.moe/v4/anime?q=${animeTitle}`;
    return this.axios.get(url);
  }
}