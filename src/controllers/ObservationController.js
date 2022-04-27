//luetaan json tiedosto muuttujaan birds:
export function getBirds(){
    fetch('http://localhost:8080/getBirds')
    .then(response => response.json())
    .then(data => console.log(data));
}