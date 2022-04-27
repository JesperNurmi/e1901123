import React, {useState, useEffect} from "react";

const ObservationComponent =(props)=>{
    //näin muutetaan array <option>-elementiksi
    //ensimmäine on muuttuja, toinen on funktio, alustetaan objektiksi
    const [observation, setObservation] =useState({});
    var today = new Date();
    var date = today.getFullYear()+'-'+(today.getMonth()+1)+'-'+today.getDate();
    var time = today.getHours() + ":" + today.getMinutes() + ":" + today.getSeconds();
    var dateTime = date+' '+time;  
    //huolehditaan, että paikkakunta ja aika default-arvot laitetaan vaan kerran
    //useEffectin perässä oleva tyhjä [] tarkoittaa että tehdään vaan kerran
    useEffect(()=>{
        setObservation({...observation, "place":"Vaasa","time":dateTime});
    },[])
 
    
    const birdOptions= props.linnut.map(bird=>{
        return <option>{bird.finnish}</option>
    })
    function update(event){
        setObservation({...observation, [event.target.id]:event.target.value});
    }
    return(
        <div>
            <h2>Save bird observation</h2>
            <div>Lintu<select>{birdOptions}</select></div>
            <div>Paikkakunta<input id="place" value={observation.place} onBlur={(event)=>update(event)} type="text"></input></div>
            <div>Aika<input id="time" type="text" onBlur={(event)=>update(event)} value={observation.time}></input></div>
            <div>Email<input id="email" type="text" onBlur={(event)=>update(event)}></input></div>
        
            {JSON.stringify(observation)}
        </div>
    );
}

export default ObservationComponent;

//npm install
//npm start