import React from 'react';
import {View, Text, StyleSheet, ImageBackground, ScrollView } from 'react-native';
import {GameCard} from '../components/Votes/GameCard'
import { Header } from '../components/Votes/Header';


export function VotesScreen(){
    return (
        <View style={styles.container}>
            <Header/>
            <ScrollView>
                
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