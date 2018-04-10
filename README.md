# slack-like-codecool-app

## Task

To exercise networking implement one project from list in two man team.
In this case choosen project is: *Another clone of slack*.
Chat application that runs on LAN supporting multiple users.

## Requirements

  * Command signature should look in a following way: <code>java NetChat mode [address] port</code>
  * Application should have to modes: client, server.
  * Application should allow bi-directional communication many client.
  * Application should use TCP protocol.
  * Communication should be done through exchanging Message objects not Strings.
  * Application should use serialization
  * When a client disconnects from a server, server should wait for the next client. 
  * When a server disconnects, client should be turned off gracefully.
  * (Optional) You may use JavaFX or Swing for more fancy GUI
