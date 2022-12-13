import React, {Component, useEffect, useState, } from 'react';
import {View, Text, StyleSheet, ImageBackground, ScrollView } from 'react-native';
import {GameCard} from '../components/Votes/GameCard'
import { Header } from '../components/Votes/Header';
import { clientGetGames } from '../api/api';
import { RefreshControl } from 'react-native';
import { } from '../components/Votes/GameCard';
import { Routes } from '../../src/routes';
import { gameInterface } from '../interfaces/gameInterface';

export function VotesScreen(){

 
    
    const[atualizando,setAtualizando]= useState(false)
    
    function aoAtualizar(){
        setAtualizando(true)
        console.log('até aqui veio')
       
        setTimeout(()=>{setAtualizando(false)},2000,)
        
        
    }
   
    
    const [ gameList, setGameList] = useState([{}])
    useEffect (()=>{
        (async ()=> {
            const response = await clientGetGames()
            setGameList(response)
            
        })()

    },[])
    return (
        <View style={styles.container}>
            <Header/>
           
            <ScrollView style={styles.gameArea}
                
                refreshControl ={
                  
                    <RefreshControl
                        refreshing={atualizando}
                    
                        onRefresh={aoAtualizar}
                        
                        
                    />
                    
                }

                >
                {gameList.map(game => GameCard(game))}
               
           </ScrollView>
         
        </View>
       
    )
}
const styles = StyleSheet.create({
    container: {
      flex: 1,
      color:'#fff',
      backgroundColor: '#191919',
      alignItems: 'center',
      justifyContent: 'center'
    },
    gameArea:{
      flex:1,
      paddingTop:10,
      paddingBottom: 20,
      width:'100%'
    }
  });
  