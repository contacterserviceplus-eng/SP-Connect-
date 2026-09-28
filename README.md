# SP Connect

Projet Android de Service Plus Bénin / SP Connect.

## Paiement intégré
L'application contient un flux Mobile Money avec :
- MTN Mobile Money
- Moov Money
- Celtis Money
- saisie du montant, numéro payeur et référence de transaction
- enregistrement de la demande dans Firebase Firestore
- statut initial `PENDING` pour validation par l'administration
- identifiant unique de paiement

## Mise en production
Les numéros Mobile Money sont volontairement placés dans `PaymentConfig.kt` sous forme `À CONFIGURER` : ils doivent être remplacés par les numéros professionnels validés.

Le flux actuel est une **validation de paiement**. Pour débiter automatiquement le client et confirmer automatiquement la transaction, il faut connecter une API de paiement Mobile Money avec ses identifiants marchands et son webhook côté serveur.
