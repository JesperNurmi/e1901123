import React from 'react';
import logo from './logo.svg';
import './App.css';
import ObservationContainer from './containers/ObservationContainer';
import { getBirds } from './controllers/ObservationController';

function App() {
  getBirds()
  return (
    <div className="App">
     <ObservationContainer/>
    </div>
    
  );
}

export default App;
