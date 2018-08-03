#!/usr/bin/env python
import sys

from suds.client import Client

url = "http://localhost:7777/ws/SoapService?wsdl"
client = Client(url)


print "SocialBuddy SOAP client"
while True:
    print "1)Posts de un usuario"
    print "2)Crear post"
    print "3)Salir\n"
    num = input("Digite un numero 1-3:")
    
    if num == 1:
        data = raw_input('Nombre de usuario: ')
        print "---------------------------------------------------"
        print "               Lista de Posts"
        print "---------------------------------------------------"
        
        user=client.service.getPostsUsuario(data)
        if(user is None):
                print "El usuario no fue enonctrado o no tiene posts."
        print user
        print ""
        
    elif num == 2:
        print "---------------------------------------------------"
        print "               Crear Post"
        print "---------------------------------------------------"
        nom = raw_input('Nombre de usuario: ')
        pas = raw_input('Password: ')
        text = raw_input('Texto: ')
        post=client.service.crearPost(nom,pas,text)
        print post
        print "\n---------------------------------------------------\n"
        
    elif num == 3:
        print "Gracias por usar el SOAP client de SocialBuddy"
        sys.exit()



