async function searchAnime(animeName) {
  try {
    const response = await fetch("http://localhost:8080/api/anime/search", {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(animeName),
    });

    if (!response.ok) {
      throw new Error("Erro ao buscar anime");
    }

    const animeData = await response.json();
    console.log(animeData);
    return animeData;
  } catch (error) {
    console.error(error);
  }
}
