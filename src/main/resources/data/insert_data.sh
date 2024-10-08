#!/bin/bash

# Create the data directory if it doesn't exist
mkdir -p /home/ec2-user/data

# Set permissions for the data directory
chmod 755 /home/ec2-user/data

# Change ownership of SQL files to postgres (if they already exist)
sudo chown postgres:postgres /home/ec2-user/data/*.sql

# Load data from each SQL file into the PostgreSQL database
for file in /home/ec2-user/data/*.sql; do
    if sudo -i -u postgres psql -d fleet_management -f "$file"; then
        echo "Successfully loaded $file"
    else
        echo "Error loading $file"
    fi
done

# Set permissions for SQL files
chmod 644 /home/ec2-user/data/*.sql

# sudo ./insert_data.sh