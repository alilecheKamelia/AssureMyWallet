# Projet-Innovation des SI

### AssureMyWallet

## Contexte et Objectifs du projet en g�n�ral :
***

- Assurer les actifs num�riques en cas de vol , ou en cas de perte d'acc�s.
- Assurer les portefeuille � froid (pas connect� sur le march� des exchanges)
- Proposer un paiement en cryptomonnaie (API:Bifinity).
- Estimer les fonds des potentiels clients ainsi que la cotisation que nous allons recevoir des soci�taires(API:Binance).
- CoinCover un fournisseur de solution de protection pour les portefeuilles crypto

## Concept
***

Proposer une Assurance pour les actifs num�riques (monnaies, nft ,etaverse) .

## Plus-value du concept
***


- S�curiser les portefeuilles num�riques de nos client.
- Attirer les investisseurs sur le march� des actifs num�riques.
- Innover et proposer un mode de paiement en cryptomonnaies .


## Pr�-requis et outils
***

- docker
- un IDE type IntelliJ
- java
- PostMan

## Lancer le projet
***

Dans la  racine du projet ex�cutez  :
```ignorelang
docker build .
```




## Interroger le service
***

Avec un navigateur:(devis client) :

- http://localhost:8099/devis/clients/ -> Permet d'enregistrer un devis client dans notre base
- http://localhost:8099/devis/clients/ -> retourne les devis clients d�j� renseign�s chez nous
- http://localhost:8099/devis/clients/{id} -> retourne les d�tails du client avec l'id {id}

Sinon dans postman ou le fichier requests.http dans le dossier ressources de notre projet

- http://localhost:8099/contrats -> Permet de voir les contrats proG�rer de nouveaux contrats en cas d'evolution de nos produits RDV sur
pos�s dans notre base
- http://localhost:8099/contrat/add -> Permet d'ajouter de nouveaux contrats
- http://localhost:8099/contrat/{id} -> Permet de voir les d�tails du contrat
- http://localhost:8099/contrat/garanties/{id} -> Permet de voir les d�tails de garanties du contrat
(BINANCE API)
- Nous nous somme  bas� sur https://github.com/binance/binance-spot-api-docs/blob/master/rest-api.md
pour interroger l'api de binance



## La base de donn�es

Vous pouvez consulter le fichier "mydb.json" pour voir la structure de la table client qui est principalement utilis�e pour ce projet et requetter .
Pour requetter sur un terminal mongo shell .
