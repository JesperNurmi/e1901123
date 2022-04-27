import React from "react";
import ObservationComponent from "../components/ObservationComponent";
import { getBirds } from "../controllers/ObservationController";

const ObservationContainer =()=>{
    const birds = getBirds();
    return(
        <div>
            <ObservationComponent linnut={birds}/>
        </div>
    );
}

export default ObservationContainer;