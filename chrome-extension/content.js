//content.js
const fetchRatings = () => {
    $(".media-lists__td-title").map(async function () {
        const name = this.innerText;
        const response = await fetch(`https://www.omdbapi.com/?t=${name}&apikey=e48e70b4`)
        const {imdbRating} = await response.json()
        this.innerText = `${name} (${imdbRating})`
    })
}

fetchRatings();